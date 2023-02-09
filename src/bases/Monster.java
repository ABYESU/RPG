package bases;

import utils.Dice;

// 人間を表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		super(name, weapon);// Livingクラスで定義したコンストラクタを利用する
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int num = Dice.get(1, 10);
		int giveDamage = getOffensive() * num;

		// 相手のHPをダメージ値だけ減らす
		int targetHp = target.getHp() - giveDamage;
		target.setHp(targetHp);

		// コンソールにステータスを表示
		System.out.println(
				"「" + getName() + "」が「" + getWeapon() + "」で攻撃！「" + target.getName() + "」に" + giveDamage + "のダメージを与えた。");

	}
}