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
public class Comorbilidad {

    private Boolean diabetes, hipertencionArterial, obesidad, enfCard, enfPul;

    public Comorbilidad(Boolean diabetes, Boolean hipertencionArterial, Boolean obesidad, Boolean enfCard, Boolean enfPul) {
        this.diabetes = diabetes;
        this.hipertencionArterial = hipertencionArterial;
        this.obesidad = obesidad;
        this.enfCard = enfCard;
        this.enfPul = enfPul;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getHipertencionArterial() {
        return hipertencionArterial;
    }

    public void setHipertencionArterial(Boolean hipertencionArterial) {
        this.hipertencionArterial = hipertencionArterial;
    }

    public Boolean getObesidad() {
        return obesidad;
    }

    public void setObesidad(Boolean obesidad) {
        this.obesidad = obesidad;
    }

    public Boolean getEnfCard() {
        return enfCard;
    }

    public void setEnfCard(Boolean enfCard) {
        this.enfCard = enfCard;
    }

    public Boolean getEnfPul() {
        return enfPul;
    }

    public void setEnfPul(Boolean enfPul) {
        this.enfPul = enfPul;
    }

}
