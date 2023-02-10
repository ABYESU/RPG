package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	public Slime(String name, String weapon) {
		super(name, weapon);

		// 乱数の範囲を指定してslimeのヒットポイントを作成
		int slimeHp = Dice.get(70, 130);

		// 作成したヒットポイントをsetする
		setHp(slimeHp);

		// 乱数の範囲を指定してslimeの攻撃力を作成
		int slimeOffensive = Dice.get(5, 11);
		;
		// 作成した攻撃力をsetする
		setOffensive(slimeOffensive);
	}
}
