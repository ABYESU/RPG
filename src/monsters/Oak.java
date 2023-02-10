package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してoakのヒットポイントを作成
		int oakHp = Dice.get(170, 230);
		// 作成したヒットポイントをsetする
		setHp(oakHp);

		// 乱数の範囲を指定してoakの攻撃力を作成
		int oakOffensive = Dice.get(9, 15);
		// 作成した攻撃力をsetする
		setOffensive(oakOffensive);
	}
}
