package com.ch.java;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * ע���ʹ��
 * 1.ע�����
 * ��ʵ���Ǵ�����������ǣ���Щ��ǿ����ڱ��룬����أ�����ʱ����ȡ����ִ����Ӧ�Ĵ���
 * ͨ��ʹ��Annotation������Ա�����ڲ��ı�ԭ���߼�������£���Դ�ļ���Ƕ��һЩ������Ϣ��
 * <p>
 * 2.������ע��ʾ��
 * ʾ��һ�������ĵ���ص�ע��
 * ʾ����������ʱ���и�ʽ�������õ���������ע��
 * ʾ���������ٴ��������ԣ�ʵ�ִ��������ļ�����
 * <p>
 * 3.�Զ���ע�⣺����@SuppressWarnings����
 * 1.ע������Ϊ @interface
 * 2.�ڲ������Ա��ͨ��ʹ��value��ʾ
 * 3.����ָ����Ա��Ĭ��ֵ��ʹ��default�Ķ���
 * 4.����Զ���ע��û�г�Ա��������һ����ʶ���á�
 * <p>
 * ���ע���г�Ա����ʹ��ע��ʱ����Ҫָ����Ա��ֵ��
 * <p>
 * 4.jdk5�е�4��Ԫע��
 * Ԫע�⣺������ע����н���˵����ע��
 * Retention:ָ�������ε�ע����������ڣ�SOURCE\CLASS��Ĭ�ϣ�\RUNTIME
 * ֻ������ΪRUNTIME��ע�⣬����ͨ�������ȡ��
 * <p>
 * Target��ָ�������ε�Annotation ������������Щ����Ԫ��
 * ************����Ƶ�ʽϵ�************
 * Documented:����ָ����Annotation ����javadoc������ȡ���ĵ�
 * Inherited:����ָ����Annotation�����м̳���
 * <p>
 * 5.ͨ�������ȡע����Ϣ---���䲿��ϸ��
 *
 * @author chenpi
 * @create 2022-02-15 21:26
 */
public class AnnotationTest {

    public static void main(String[] args) {
        @SuppressWarnings({"unused"})
        int num = 10;
    }


    @Test
    public void testGetAnnotation() {
        Class clazz = Student.class;
        Annotation[] annotation = clazz.getAnnotations();
        for (int i = 0; i < annotation.length; i++) {
            System.out.println(annotation[i]);
        }

    }

}

interface info {
    void show();
}

@MyAnnotation(value = "hi")
class Persion {
    private String name;
    private int age;

    public Persion() {
    }

    public Persion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk() {
        System.out.println("People walk");
    }

    public void eat() {
        System.out.println("People eat");
    }
}

class Student extends Persion implements info {
    @Override
    public void walk() {
        System.out.println("Student walk");
    }

    @Override
    public void eat() {
        System.out.println("Student eat");
    }

    @Override
    public void show() {

    }
}