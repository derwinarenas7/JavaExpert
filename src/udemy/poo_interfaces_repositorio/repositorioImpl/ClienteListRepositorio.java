package udemy.poo_interfaces_repositorio.repositorioImpl;

import udemy.poo_interfaces_repositorio.modelo.Cliente;
import udemy.poo_interfaces_repositorio.repositorio.CrudRepositorio;
import udemy.poo_interfaces_repositorio.repositorio.OrdenableRepositorio;
import udemy.poo_interfaces_repositorio.repositorio.PaginableRepositorio;
import udemy.poo_interfaces_repositorio.utils.Direccion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource.stream().toList();
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cliente : dataSource) {
            if (cliente.getId().equals(id)) {
                resultado = cliente;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminarPorId(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    switch (campo) {
                        case "id" -> resultado = a.getId().compareTo(b.getId());
                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if (dir == Direccion.DESC) {
                    switch (campo) {
                        case "id" -> resultado = b.getId().compareTo(a.getId());
                        case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return resultado;
            }
        });
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


}
