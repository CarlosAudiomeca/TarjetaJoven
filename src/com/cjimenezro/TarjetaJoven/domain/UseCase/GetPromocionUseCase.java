package com.cjimenezro.TarjetaJoven.domain.UseCase;

import com.cjimenezro.TarjetaJoven.domain.PromocionRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Promocion;

import java.util.List;

public class GetPromocionUseCase {

    private PromocionRepository promocionRepository;

    public GetPromocionUseCase(PromocionRepository promocionRepository){
        this.promocionRepository=promocionRepository;
    }

    public List<Promocion> execute(){
        return promocionRepository.getAll();
    }


}
