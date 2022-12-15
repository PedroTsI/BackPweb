package br.edu.ifpb.meuimovel.io.services;

import br.edu.ifpb.meuimovel.io.models.Imovel;
import br.edu.ifpb.meuimovel.io.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImovelService {
    @Autowired
    private ImovelRepository imovelrepository;

    public Imovel getImovel(Long id) throws RuntimeException {
        return imovelrepository.findById(id).orElseThrow(
                () -> new RuntimeException("Imovel not found with id: " + id)
        );
    }

    @Transactional
    public Imovel create(Imovel imovel) {
        return imovelrepository.save(imovel);
    }

    @Transactional
    public Imovel update(Long id, Imovel imovel) {
        Imovel imovelToUpdate = this.getImovel(id);

        if (imovel.getValor() != null)
            imovelToUpdate.setValor(imovel.getValor());
        if (imovel.getTelefone() != null)
            imovelToUpdate.setTelefone(imovel.getTelefone());
        if (imovel.getImagem() != null)
            imovelToUpdate.setImagem(imovel.getImagem());
        return imovelrepository.save(imovelToUpdate);
    }

    @Transactional
    public Imovel updateVenda(Long id, Imovel imovel){
        Imovel imovelToUpdate = this.getImovel(id);
        imovelToUpdate.setStatus(imovel.getStatus());
        return imovelrepository.save(imovelToUpdate);
    }

    @Transactional
    public void delete(Long id) {
        imovelrepository.deleteById(id);
    }

    public List<Imovel> listar(){
        return imovelrepository.findAll();
    }

}
