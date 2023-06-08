package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import controller.Controller;
import dao.OrderDAO;
import util.ProdView;

public class OrderService {
	Scanner sc = new Scanner(System.in);
	private static OrderService instance;

	private OrderService() {
	}

	public static OrderService getInstance() {
		if (instance == null)
			instance = new OrderService();
		return instance;
	}

	private ProdView prodView = ProdView.getInstance();
	private OrderDAO dao = OrderDAO.getInstance();

	public void selectProd() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String memid = (String) Controller.sessionStorage.get("MEM_ID");

		while (true) {
			List<Object> param = new ArrayList<Object>(); // param 리스트 초기화

			List<Map<String, Object>> list = dao.selectList();
			prodView.displayProd(list);
			System.out.println("-----------------------------");

			System.out.print("상품선택: ");
			int choice = sc.nextInt();

			System.out.print("수량: ");
			int qty = sc.nextInt();

			String pid = (String) list.get(choice - 1).get("PROD_ID");
			int price = Integer.parseInt(String.valueOf(list.get(choice - 1).get("PROD_PRICE")));

			param.add(memid);
			param.add(pid);
			param.add(qty);

			result = dao.insertOrder(param);

			System.out.print("상품을 계속 선택하겠습니까? (y/n): ");
			String flag = sc.next();
			if (!(flag.equalsIgnoreCase("y")))
				break;
		}
	}
}