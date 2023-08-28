package com.Iphone2007.Musica;

import java.util.UUID;

public class Reprodutor implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");
    }

    @Override
    public void Reproduzir(UIID musica) {
        System.out.println("Selecionar musica");

    }


}
