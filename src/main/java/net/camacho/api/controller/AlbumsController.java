package net.camacho.api.controller;


import net.camacho.api.entity.Album;
import net.camacho.api.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumsController {
    @Autowired
    private IAlbumsService albumsService;

    @GetMapping("/albums")
    public List<Album> buscarTodos(){
        return albumsService.buscarTodos();
    }

    @PostMapping("/albums")
    public Album guardar(@RequestBody Album album){
        albumsService.guardar(album);
        return album;
    }

    @PutMapping("/albums")
    public Album modificar(@RequestBody Album album){
        albumsService.guardar(album);
        return album;
    }

    @DeleteMapping("/albums/{id}")
    public String eliminar(@PathVariable("id") int idAlbum){
        albumsService.eliminar(idAlbum);
        return "Registro eliminado";
    }
}
