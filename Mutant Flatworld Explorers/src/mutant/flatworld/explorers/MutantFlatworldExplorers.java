/*
 * 主程式名稱：MutantFlatworldExplorers
 * 模擬在一個有邊界的矩形世界中機器人的移動，
 * 若機器人移動出邊界則會 LOST，並留下氣味防止其他機器人從相同位置掉落。
 */
package mutant.flatworld.explorers;

import java.util.*;

public class MutantFlatworldExplorers {
    // 世界邊界最大座標
    static int maxX, maxY;
    // 用來記錄氣味的位置（機器人掉落的位置與方向）
    static Set<String> scent = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取第一行：右上角的邊界座標
        maxX = sc.nextInt();
        maxY = sc.nextInt();
        sc.nextLine(); // 讀掉換行符

        // 處理每一台機器人
        while (sc.hasNext()) {
            // 讀取機器人的初始位置與方向
            int x = sc.nextInt();
            int y = sc.nextInt();
            char dir = sc.next().charAt(0); // N、S、E、W 方向
            sc.nextLine(); // 換行
            String cmds = sc.nextLine(); // 指令字串：包含 L、R、F

            boolean lost = false; // 記錄這台機器人是否掉落

            // 逐一處理每一個指令
            for (char cmd : cmds.toCharArray()) {
                if (cmd == 'L') {
                    dir = turnLeft(dir); // 左轉
                } else if (cmd == 'R') {
                    dir = turnRight(dir); // 右轉
                } else if (cmd == 'F') {
                    // 嘗試前進一步
                    int nx = x, ny = y;

                    // 根據方向設定下一格的座標
                    if (dir == 'N') ny++;
                    else if (dir == 'S') ny--;
                    else if (dir == 'E') nx++;
                    else if (dir == 'W') nx--;

                    // 檢查是否走出邊界
                    if (nx < 0 || ny < 0 || nx > maxX || ny > maxY) {
                        // 判斷這個點+方向有沒有氣味（代表之前掉過一次）
                        String key = x + " " + y + " " + dir;
                        if (!scent.contains(key)) {
                            // 第一次掉下去 → 記錄 LOST 和氣味
                            lost = true;
                            scent.add(key);
                            break; // 結束這台機器人的指令處理
                        }
                        // 若有氣味，忽略這個 F 指令（不動）
                    } else {
                        // 沒掉落 → 更新座標
                        x = nx;
                        y = ny;
                    }
                }
            }

            // 印出機器人的最終位置與方向
            System.out.print(x + " " + y + " " + dir);
            if (lost) System.out.print(" LOST"); // 若掉落，加上 LOST 標記
            System.out.println();
        }

        sc.close(); // 關閉輸入串流
    }

    // 根據目前方向返回左轉後的新方向
    static char turnLeft(char dir) {
        return switch (dir) {
            case 'N' -> 'W';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'E' -> 'N';
            default -> dir; // 萬一方向錯誤則保持不變
        };
    }

    // 根據目前方向返回右轉後的新方向
    static char turnRight(char dir) {
        return switch (dir) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default -> dir; // 萬一方向錯誤則保持不變
        };
    }
}
