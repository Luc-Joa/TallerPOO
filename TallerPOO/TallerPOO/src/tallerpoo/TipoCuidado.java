/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.awt.Color;
import java.util.Objects;

public class TipoCuidado {

    private Boolean tapabocas, distanciamiento, desinfectar, evitarcontacto;

    public TipoCuidado(Boolean tapabocas, Boolean distanciamiento, Boolean desinfectar, Boolean evitarcontacto) {
        this.tapabocas = tapabocas;
        this.distanciamiento = distanciamiento;
        this.desinfectar = desinfectar;
        this.evitarcontacto = evitarcontacto;
    }

    /*
     * return @tapabocas
     */
    public Boolean getTapabocas() {
        return tapabocas;
    }

    /*
    * set @tapabocas
     */
    public void setTapabocas(Boolean tapabocas) {
        this.tapabocas = tapabocas;
    }

    /*
     * return @distanciamiento
     */
    public Boolean getDistanciamiento() {
        return distanciamiento;
    }

    /*
    * set @distanciamiento
     */
    public void setDistanciamiento(Boolean distanciamiento) {
        this.distanciamiento = distanciamiento;
    }

    /*
     * return @desinfectar
     */
    public Boolean getDesinfectar() {
        return desinfectar;
    }

    /*
    * set @desinfectar
     */
    public void setDesinfectar(Boolean desinfectar) {
        this.desinfectar = desinfectar;
    }

    /*
     * return @evitarcontacto
     */
    public Boolean getEvitarcontacto() {
        return evitarcontacto;
    }

    /*
    * set @evitarcontacto
     */
    public void setEvitarcontacto(Boolean evitarcontacto) {
        this.evitarcontacto = evitarcontacto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoCuidado other = (TipoCuidado) obj;
        if (!Objects.equals(this.tapabocas, other.tapabocas)) {
            return false;
        }
        if (!Objects.equals(this.distanciamiento, other.distanciamiento)) {
            return false;
        }
        if (!Objects.equals(this.desinfectar, other.desinfectar)) {
            return false;
        }
        if (!Objects.equals(this.evitarcontacto, other.evitarcontacto)) {
            return false;
        }
        return true;
    }

    /**
     * da el color a cada persona según el tipo de cuidado que esta tenga
     *
     * @return Colore
     */
    public Color tipoCuidado() {
        if (tapabocas && distanciamiento && desinfectar && evitarcontacto) {
            return Color.GREEN;
        } else if (tapabocas) {
            return Color.YELLOW;
        } else if (!(tapabocas && distanciamiento && desinfectar && evitarcontacto)) {
            return Color.ORANGE;
        }
        return Color.ORANGE;
    }
}
