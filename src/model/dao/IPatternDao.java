package model.dao;

import java.util.List;

import model.entities.EntityPattern;

public interface IPatternDao<B extends EntityPattern> {
	public void insert(B entity);
	public void update(B entity);
	public void deleteById(Integer id);
	public B findById(Integer id);
	public List<B> findById();
	

}
