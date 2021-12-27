package report3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * Warriorクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する。
     * 検証手順
     *  (1) Warriorと敵を準備。ヒーローの攻撃力は100とする。
     *  (2) Warrior.attackWithWeponSkillを実行し、その際のダメージが150であることを確認したい。
     *  (3) そのためにhitPointが1000の敵を用意。この敵に対して(2)を3回実行すると、残りhitPointが550であることを検証する。
     */
    @Test
    void attackTest() {
        int defaultWarriorAttack = 100;
        int defaultEnemyHp = 1000;
        Warrior warrior = new Warrior("ウォーリア", 1, defaultWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 100);
        warrior.attackWithWeponSkill(slime);
        warrior.attackWithWeponSkill(slime);
        warrior.attackWithWeponSkill(slime);
        assertEquals(slime.getHitPoint(), 550);
    }
}
