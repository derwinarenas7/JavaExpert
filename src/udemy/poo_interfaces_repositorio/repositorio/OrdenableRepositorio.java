package udemy.poo_interfaces_repositorio.repositorio;

import udemy.poo_interfaces_repositorio.modelo.Cliente;
import udemy.poo_interfaces_repositorio.utils.Direccion;

import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}
