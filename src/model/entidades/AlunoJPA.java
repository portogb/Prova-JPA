package model.entidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.service.InterfaceActions;

public class AlunoJPA implements InterfaceActions {

	public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");

	@Override
	public void atualizarAluno(Aluno obj) {
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.merge(obj);
		manager.getTransaction().commit();
	}

	@Override
	public void deletar(Integer id) {
		EntityManager manager = factory.createEntityManager();

		Aluno aluno = manager.find(Aluno.class, id);

		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();
	}

	@Override
	public void inserirAluno(Aluno obj) {
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		manager.persist(obj);
		manager.getTransaction().commit();

		manager.close();
	}

	@Override
	public Aluno buscarAluno(Integer id) {

		EntityManager manager = factory.createEntityManager();

		Aluno aluno = manager.find(Aluno.class, id);

		return aluno;
	}

	@Override
	public List<Aluno> listarAluno() {
		EntityManager manager = factory.createEntityManager();

		String sql = "select a from Aluno a";

		Query query = manager.createQuery(sql);

		List<Aluno> list = query.getResultList();

		return list;
	}

	@Override
	public List<Aluno> filtrarPorLetra(String letra) {
		EntityManager manager = factory.createEntityManager();

		String sql = "select a from Aluno a " + "where a.nome like '" + letra + "%'";

		Query query = manager.createQuery(sql);

		List<Aluno> list = query.getResultList();

		return list;
	}

}
