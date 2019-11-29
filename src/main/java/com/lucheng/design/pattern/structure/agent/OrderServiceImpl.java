package com.lucheng.design.pattern.structure.agent;

public class OrderServiceImpl implements IOrderService{
    private OrderDao orderDao;
    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        System.out.println("service层调用dao成功");
        return orderDao.insert(order);
    }
}
