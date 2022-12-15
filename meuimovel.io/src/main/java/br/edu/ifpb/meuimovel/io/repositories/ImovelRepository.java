package br.edu.ifpb.meuimovel.io.repositories;

import br.edu.ifpb.meuimovel.io.models.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImovelRepository extends JpaRepository<Imovel, Long>{
    public Imovel findByEndereco(String endereco);
    public Imovel findByNumero(String numero);
}
