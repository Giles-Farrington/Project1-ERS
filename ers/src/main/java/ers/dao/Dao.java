package ers.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, I extends Serializable> {

	List<T> getAll();
	T getOne(I id);
	T save(T obj);
	T update(T obj);
	void delete(I id);
	default boolean isUnique(T obj) {
		return true;
	}
}
