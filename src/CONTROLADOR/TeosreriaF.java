/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import MODELO.Modelo;
import VISTA.Indice;
import VISTA.MaestroProveedor_index;
import VISTA.plantilla_Filtro;
import VISTA.plantilla_Incripcion_Maestro_Proveedores;
import VISTA.plantilla_Inscripcion_centroCosto;
import VISTA.plantilla_Inscripcion_comprobante;

/**
 *
 * @author Labing
 */
public class TeosreriaF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Indice view_Indice = new Indice();
        MaestroProveedor_index view_MP = new MaestroProveedor_index();
        plantilla_Filtro view_PF = new plantilla_Filtro();
        plantilla_Incripcion_Maestro_Proveedores view_PIMP = new plantilla_Incripcion_Maestro_Proveedores();
        plantilla_Inscripcion_centroCosto view_PICc = new plantilla_Inscripcion_centroCosto();
        plantilla_Inscripcion_comprobante view_PIC = new plantilla_Inscripcion_comprobante();
        Modelo model = new Modelo();
        
        Controlador co = new Controlador(view_Indice,view_MP,view_PF,view_PIMP,view_PICc,view_PIC,model);
        co.Iniciar();
        view_Indice.setVisible(true);
    }
    
}
