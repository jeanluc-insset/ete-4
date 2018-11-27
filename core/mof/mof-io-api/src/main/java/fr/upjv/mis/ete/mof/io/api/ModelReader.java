/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.upjv.mis.ete.mof.io.api;

import fr.upjv.mis.ete.mof.MofModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 *
 * @author jldeleage
 */
public interface ModelReader {

    public          MofModel    readModel(MofModel inParent, String inSource) throws IOException;

    public          MofModel    readModel(MofModel inParent, Object inSource) throws IOException;

    public default  MofModel    readModel(MofModel inParent, InputStream inSource) throws IOException {
        return null;
    }

    public default  MofModel    readModel(MofModel inParent, File inSource) throws IOException {
        return readModel(inParent, new FileInputStream(inSource));
    }

    public default  MofModel    readModel(MofModel inParent, URL inSource) throws IOException {
        return readModel(inParent, inSource.openStream());
    }

    public default  MofModel    readModel(MofModel inParent, URI inSource) throws MalformedURLException, IOException {
        return readModel(inParent, inSource.toURL());
    }

}
