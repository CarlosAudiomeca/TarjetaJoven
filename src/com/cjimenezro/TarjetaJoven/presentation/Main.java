package com.cjimenezro.TarjetaJoven.presentation;

import com.cjimenezro.TarjetaJoven.data.CompraDataRepository;
import com.cjimenezro.TarjetaJoven.data.EmpresaDataRepository;
import com.cjimenezro.TarjetaJoven.data.PromocionDataRepository;
import com.cjimenezro.TarjetaJoven.data.UsuarioDataRepository;
import com.cjimenezro.TarjetaJoven.data.local.CompraFileLocalDataSource;
import com.cjimenezro.TarjetaJoven.data.local.EmpresaFileLocalDataSource;
import com.cjimenezro.TarjetaJoven.data.local.PromocionFileLocalDataSource;
import com.cjimenezro.TarjetaJoven.data.local.UsuarioFileLocalDataSource;
import com.cjimenezro.TarjetaJoven.domain.CompraRepository;
import com.cjimenezro.TarjetaJoven.domain.EmpresaRepository;
import com.cjimenezro.TarjetaJoven.domain.PromocionRepository;
import com.cjimenezro.TarjetaJoven.domain.UseCase.AddEmpresaUseCase;
import com.cjimenezro.TarjetaJoven.domain.UseCase.AddPromocionUseCase;
import com.cjimenezro.TarjetaJoven.domain.UsuarioRepository;
import com.cjimenezro.TarjetaJoven.domain.models.Empresa;
import com.cjimenezro.TarjetaJoven.domain.models.Promocion;

public class Main {



    public static void main(String[] args) {

        EmpresaRepository empresaRepository = new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance());
        PromocionRepository promocionRepository = new PromocionDataRepository(PromocionFileLocalDataSource.getInstance());
        UsuarioRepository usuarioRepository = new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance());
        CompraRepository compraRepository = new CompraDataRepository(CompraFileLocalDataSource.getInstance());

        Empresa empresa = new Empresa();
        empresa.setId("1");
        empresa.setNombre("Mascotas");
        empresa.setCif("325346434523");

        Empresa empresa2 = new Empresa();
        empresa2.setId("2");
        empresa2.setNombre("Citroen");
        empresa2.setCif("1513489456");

        AddEmpresaUseCase addEmpresaUseCase = new AddEmpresaUseCase(empresaRepository);
        addEmpresaUseCase.execute(empresa);
        addEmpresaUseCase.execute(empresa2);

        Promocion promocion1 =  new Promocion();
        promocion1.setId("1");
        promocion1.setDescripcion("cositas");
        promocion1.setTitulo("Cosas");
        promocion1.setDescuento(20);

        Promocion promocion2 =  new Promocion();
        promocion2.setId("2");
        promocion2.setDescripcion("cositas2");
        promocion2.setTitulo("Cosas2");
        promocion2.setDescuento(30);

        AddPromocionUseCase addPromocionUseCase = new AddPromocionUseCase(promocionRepository);
        addPromocionUseCase.execute(promocion1);
        addPromocionUseCase.execute(promocion2);



    }
}