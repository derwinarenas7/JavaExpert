package udemy.poo_interfaces_repositorio;

import udemy.poo_interfaces_repositorio.modelo.Cliente;
import udemy.poo_interfaces_repositorio.repositorio.CrudRepositorio;
import udemy.poo_interfaces_repositorio.repositorio.OrdenableRepositorio;
import udemy.poo_interfaces_repositorio.repositorio.PaginableRepositorio;
import udemy.poo_interfaces_repositorio.repositorioImpl.ClienteListRepositorio;
import udemy.poo_interfaces_repositorio.utils.Direccion;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {

        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Derwin", "Arenas"));
        repo.crear(new Cliente("Andrés", "Guzmán"));
        repo.crear(new Cliente("Eida", "Arenas"));
        repo.crear(new Cliente("Jhon", "Ortega"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("============ paginable =====================");
        List<Cliente> paginable = ((PaginableRepositorio) repo).listar(2,4);
        paginable.forEach(System.out::println);
        System.out.println("============ ordenable =====================");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepositorio) repo)
                .listar("nombre", Direccion.DESC);
        for (Cliente c : clientesOrdenAsc) {
            System.out.println(c);
        }
    }

}
