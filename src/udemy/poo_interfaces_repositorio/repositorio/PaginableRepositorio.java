package udemy.poo_interfaces_repositorio.repositorio;

import udemy.poo_interfaces_repositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {

    List<Cliente> listar(int desde, int hasta);

}
