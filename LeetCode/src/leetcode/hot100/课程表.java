package leetcode.hot100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 207. 课程表
 *
 * 链接：
 * https://leetcode.cn/problems/course-schedule/description/?envType=study-plan-v2&envId=top-100-liked
 */
public class 课程表 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] du = new int[numCourses]; // 记录每个课程的入度
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>()); //构建空的邻接表
        }

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int preCourse = prerequisites[i][1];
            du[course]++; // 由于选修当前course必须要先选修preCourse，所以当前课程的入度+1

            // 构建邻接表
            list.get(preCourse).add(course); // 即preCourse -> course
        }
        // 将度为0的课程入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < du.length; i++) {
            if (du[i] == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            Integer course = queue.poll();
            count++;
            List<Integer> nextCourse = list.get(course);
            for (int i = 0; i < nextCourse.size(); i++) {
                int next = nextCourse.get(i);
                du[next]--; // 获取当前课程的出度的课程,将其入度-1
                if (du[next] == 0) { // 如果next课程入度为0，则可以入队
                    queue.offer(next);
                }
            }
        }

        if (count == numCourses) {
            return true;
        }
        return false;
    }
}
