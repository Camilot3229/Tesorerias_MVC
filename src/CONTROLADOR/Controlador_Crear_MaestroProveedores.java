/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Modelo;
import VISTA.MaestroProveedor_index;
import VISTA.plantilla_Incripcion_Maestro_Proveedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Labing
 */
public class Controlador_Crear_MaestroProveedores implements ActionListener{
    
    
    private Modelo model;
    private MaestroProveedor_index view_MP;
    private plantilla_Incripcion_Maestro_Proveedores view_PIMP;
    
    public Controlador_Crear_MaestroProveedores (plantilla_Incripcion_Maestro_Proveedores view_PIMP,MaestroProveedor_index view_MP){
        
        this.view_MP = view_MP;
        this.view_PIMP = view_PIMP;
        view_PIMP.Guardar_maestroProveedor.addActionListener(this);
        view_PIMP.Cancela_mestroProveedor.addActionListener(this);
        
    }
    
    public void Iniciar(){
        view_PIMP.setTitle("TESORERIA");
        view_PIMP.setLocationRelativeTo(null);
    }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
