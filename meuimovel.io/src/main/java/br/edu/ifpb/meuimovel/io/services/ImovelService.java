package br.edu.ifpb.meuimovel.io.services;

import br.edu.ifpb.meuimovel.io.models.Imovel;
import br.edu.ifpb.meuimovel.io.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImovelService {
    @Autowired
    private ImovelRepository ImovelRepository;


}
