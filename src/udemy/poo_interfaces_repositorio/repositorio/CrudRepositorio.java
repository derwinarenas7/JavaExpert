package udemy.poo_interfaces_repositorio.repositorio;

import udemy.poo_interfaces_repositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {

    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminarPorId(Integer id);

}
