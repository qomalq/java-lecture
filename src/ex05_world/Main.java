package ex05_world;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CityDao cDao = new CityDao();
		
		City city = cDao.getCityById(2340);
		System.out.println(city);
		
		
		City name = cDao.getCityByName("성남");
		System.out.println(name);
		System.out.println("===========================================");
		
		List<City> list = cDao.getCityList("KOR", 10);
		for (City c: list)
			System.out.println(c);
		System.out.println("========================================================");
		
		City city2 = new City("화성", "KOR", "Kyonggi",5000000);
		cDao.insertCity(city2);
		city = cDao.getCityByName("화성");
		System.out.println(city);
		System.out.println("=================================");
		
		city = cDao.getCityByName("부천");
		city.setName("부천");
		city.setPopulation(850000);
		cDao.updateCity(city);
		city = cDao.getCityByName("부천");
		System.out.println("=================================");
		
		cDao.deleteCity(5040);
		city = cDao.getCityByName("화성");
		if (city ==null)
			System.out.println("화성이 없습니다.");
		else
			System.out.println(city);
	}

}
