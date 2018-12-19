/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.god.androidmore.algorithm.other;

import android.util.Log;

public class Other {

  private static final String TAG = "Other";

  /**
   * 约瑟夫问题
   * 创建头尾相连的链表解决问题
   */
  public static void Josephus(int total, int count) {
    class Node {

      private int n;
      private Node next;

      private Node(int n) {
        this.n = n;
      }
    }

    Node header = new Node(1);
    Node x = header;
    for (int i = 2; i <= total; i++) {
      x.next = new Node(i);
      x = x.next;
    }
    x.next = header;

    Node m = header;
    int p = 1;
    while (m.n != m.next.n) {
      if (p == count - 1) {
        Log.d(TAG, "Josephus: 枪毙" + m.next.n);
        m.next = m.next.next;
        p = 0;
      }
      m = m.next;
      p = p + 1;
    }
    Log.d(TAG, "Josephus: 剩余" + m.n);
  }

  /**
   * 大数相乘算法
   */
  public static void Multiplication() {

  }
}