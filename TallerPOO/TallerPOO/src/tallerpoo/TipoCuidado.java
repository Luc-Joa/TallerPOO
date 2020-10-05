package TallerPoo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joaquin
 */
public class TipoCuidado {

    private Boolean tapabocas, distanciamiento, desinfectar, evitarcontacto;

    public TipoCuidado(Boolean tapabocas, Boolean distanciamiento, Boolean desinfectar, Boolean evitarcontacto) {
        this.tapabocas = tapabocas;
        this.distanciamiento = distanciamiento;
        this.desinfectar = desinfectar;
        this.evitarcontacto = evitarcontacto;
    }

    public Boolean getTapabocas() {
        return tapabocas;
    }

    public void setTapabocas(Boolean tapabocas) {
        this.tapabocas = tapabocas;
    }

    public Boolean getDistanciamiento() {
        return distanciamiento;
    }

    public void setDistanciamiento(Boolean distanciamiento) {
        this.distanciamiento = distanciamiento;
    }

    public Boolean getDesinfectar() {
        return desinfectar;
    }

    public void setDesinfectar(Boolean desinfectar) {
        this.desinfectar = desinfectar;
    }

    public Boolean getEvitarcontacto() {
        return evitarcontacto;
    }

    public void setEvitarcontacto(Boolean evitarcontacto) {
        this.evitarcontacto = evitarcontacto;
    }

    public Color tipoCuidado() {
        if (tapabocas && distanciamiento && desinfectar && evitarcontacto) {
            return Color.VERDE;
        } else if (tapabocas) {
            return Color.AMARILLO;
        } else if (!(tapabocas && distanciamiento && desinfectar && evitarcontacto)) {
            return Color.ANARANJADO;
        }
        return Color.ANARANJADO;
    }
}
