package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.PromocionRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Promocion;

public class AddPromocionUseCase {

    private PromocionRepository promocionRepository;

    public AddPromocionUseCase(PromocionRepository promocionRepository){
        this.promocionRepository=promocionRepository;
    }

    public void execute(Promocion promocion){
        promocionRepository.save(promocion);
    }


}
