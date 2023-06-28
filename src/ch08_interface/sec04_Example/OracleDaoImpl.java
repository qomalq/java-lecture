package ch08_interface.sec04_Example;

public class OracleDaoImpl implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 검색");		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 검색");		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 검색");		
	}

}
