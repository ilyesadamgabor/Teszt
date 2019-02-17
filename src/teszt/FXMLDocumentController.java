/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teszt;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author Helix
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtMagassag;

    @FXML
    private TextField txtSzuletett;

    @FXML
    private TextField txtNev;

    @FXML
    void mentes(ActionEvent event) {
        String nev = txtNev.getText();
        String szuletett = txtSzuletett.getText();
        int magassag = Integer.parseInt(txtMagassag.getText());
        
        //ne legyenek üres sorok
        if(nev.isEmpty() || szuletett.isEmpty()){
            return;
        }
        
        Bejelentkezes b = new Bejelentkezes();
        b.beir(nev, szuletett, magassag);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
