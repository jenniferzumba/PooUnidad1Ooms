/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad01_04;

/**
 *
 * @author jenniferzumba
 */
public class Principal {
    public static void main(String[] args) {
        var ecuador = new Seleccion();
        ecuador.setCodigoFIFA("ECU");
        ecuador.setNombre("Federación Ecuatoriana de Fútbol (FEF)");
        ecuador.setParticipacionesMundial(4);
        System.out.println(ecuador.obtienePais());

        var chile = new Seleccion();
        chile.setCodigoFIFA("CHI");
        chile.setNombre("Federación Chilena de Fútbol (FCF)");
        chile.setParticipacionesMundial(7);
        System.out.println(chile.obtienePais());

        var enner = new Jugador();
        enner.setNombre("Enner Valencia");
        enner.setPosicion("Goleador");
        enner.setFechaNacimiento(1973);
        enner.setEquipo(ecuador);

        var byron = new Jugador();
        byron.setNombre("Byron Castillo");
        byron.setPosicion("DEFENSA");
        byron.setFechaNacimiento(1956);
        byron.setEquipo(ecuador);

        var reyArturo = new Jugador();
        reyArturo.setNombre("Arturo Vidal");
        reyArturo.setPosicion("MEDIO CAMPO");
        reyArturo.setFechaNacimiento(1972);
        reyArturo.setEquipo(chile );
        
        
        var tec = new Tecnico();
        tec.setNombre("Gustavo Alfaro");
        tec.setFechaNacimiento(1962);
        tec.setYearContrato(16);
        tec.setEquipo(ecuador);

        var tec2 = new Tecnico();
        tec2.setNombre("Martín Lasarte");
        tec2.setFechaNacimiento(1879);
        tec2.setYearContrato(4);
        tec2.setEquipo(chile);

        System.out.println(enner.mostrarInfo());
        System.out.println(byron.mostarInfoJugador());
        System.out.println(reyArturo.mostrarInfo());
        System.out.println(tec.mostarInfoTecnico());
        System.out.println(tec2.mostarInfoTecnico());
        

    }
        
     
        
      
        
        
        
    
    
}
