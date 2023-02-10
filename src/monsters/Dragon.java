package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	public Dragon(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してdoragonのヒットポイントを作成
		int doragonHp = Dice.get(270, 330);
		// 作成したヒットポイントをsetする
		setHp(doragonHp);

		// 乱数の範囲を指定してdoragonの攻撃力を作成
		int doragonOffensive = Dice.get(12, 18);
		// 作成した攻撃力をsetする
		setOffensive(doragonOffensive);
	}
}
