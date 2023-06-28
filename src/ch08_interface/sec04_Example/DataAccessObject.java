package ch08_interface.sec04_Example;

public interface DataAccessObject {
	void select();			// 실제로는 DTO type
	void insert();
	void update();
	void delete();
}
