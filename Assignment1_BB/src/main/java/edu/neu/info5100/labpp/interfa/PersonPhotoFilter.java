/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info5100.labpp.interfa;

/**
 *
 * @author kathe
 */
import java.io.File;

/**
 *
 * @author kathe
 */
class PersonPhotoFilter extends javax.swing.filechooser.FileFilter {
        
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".jpg")|| file.getAbsolutePath().endsWith(".png");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Image documents (*.jpg&&*.png)";
        }
    } 