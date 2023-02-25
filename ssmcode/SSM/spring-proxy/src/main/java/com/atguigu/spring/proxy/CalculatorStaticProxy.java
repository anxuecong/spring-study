package com.atguigu.spring.proxy;

public class CalculatorStaticProxy implements Calculator{

    private CalculatorImpl target;

    public CalculatorStaticProxy(CalculatorImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        int result = 0;
        try {
            System.out.println("日志，方法：add，参数：" + i + "," + j);
            result = target.add(i, j);
            System.out.println("日志，方法：add，结果：" + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("日志，方法：sub，参数：" + i + "," + j);
        int result = target.add(i, j);
        System.out.println("日志，方法：sub，结果：" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("日志，方法：mul，参数：" + i + "," + j);
        int result = target.add(i, j);
        System.out.println("日志，方法：mul，结果：" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("日志，方法：div，参数：" + i + "," + j);
        int result = target.add(i, j);
        System.out.println("日志，方法：div，结果：" + result);
        return result;
    }
}
