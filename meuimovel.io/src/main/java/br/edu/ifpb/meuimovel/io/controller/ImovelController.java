package br.edu.ifpb.meuimovel.io.controller;

import br.edu.ifpb.meuimovel.io.models.Imovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.edu.ifpb.meuimovel.io.services.ImovelService;

@RestController
@RequestMapping("/api/imovel")
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @GetMapping("/{id}")
    public Imovel get(@PathVariable("id") Long id) {
        return imovelService.get(id);
    }

    @PostMapping
    public Imovel create(@RequestBody Imovel Imovel) {
        return imovelService.create(Imovel);
    }

    @PutMapping("/{id}")
    public Imovel update(@PathVariable("id") Long id, @RequestBody Imovel Imovel) {
        return imovelService.update(id, Imovel);
    }

    @PutMapping("/{id}")
    public Imovel update(@PathVariable("id") Long id, @RequestBody Imovel Imovel) {
        return imovelService.venderImovel(id, Imovel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        imovelService.delete(id);
    }
}
