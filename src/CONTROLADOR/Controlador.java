/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.*;
import VISTA.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Felipe
 */
public class Controlador implements ActionListener{
    
    private Indice view_Indice;
    private MaestroProveedor_index view_MP;
    private plantilla_Filtro view_PF;
    private plantilla_Incripcion_Maestro_Proveedores view_PIMP;
    private plantilla_Inscripcion_centroCosto view_PICc;
    private plantilla_Inscripcion_comprobante view_PIC;
    private Modelo model;     
    private JButton b1 = new JButton("Boton 1");
    

    
    public Controlador(Indice view_Indice,MaestroProveedor_index view_MP,plantilla_Filtro view_PF,
    plantilla_Incripcion_Maestro_Proveedores view_PIMP,plantilla_Inscripcion_centroCosto view_PICc,
    plantilla_Inscripcion_comprobante view_PIC,Modelo model){
        this.view_Indice = view_Indice;
        this.view_MP = view_MP;
        this.view_PF = view_PF;
        this.view_PIC = view_PIC;
        this.view_PICc = view_PICc;
        this.view_PIMP = view_PIMP;
        this.model = model;
        b1.addActionListener(this);
        
    }
    
    public void Iniciar(){
        view_Indice.setTitle("TESORERIA");
        view_Indice.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
    
        if (e.getSource() == b1) {
            System.out.println("Hola mundo");
        }
    
///e.getSource()=
    }
    
}
