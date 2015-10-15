/**
 * トランプのカードを表すクラス。
 */

public class Card {

	/** 定数 */
	/** ジョーカーを表す定数 */
	public static final int JOKER = 0;
	
	/** スペードを表す定数 */
	public static final int SPADE   = 1;
	
	/** ダイヤを表す定数 */
	public static final int DIAMOND = 2;
	
	/** クラブを表す定数 */
	public static final int CLUB    = 3;
	
	/** ハートを表す定数 */
	public static final int HEART   = 4;

	/** プロパティ */
	/** カードの示すスート */
	private int suit_;
	
	/** カードの示す数 */
	private int number_;

	/**
	 * 引数付きコンストラクタ。
	 * 
	 * @param suit スート
	 * @param number 数 (0の場合はジョーカーとして扱う)
	 */
	public Card(int suit, int number)
	{
		this.suit_ = suit;
		this.number_ = number;
	}

	/** メソッド */
	/**
	 * 数字を見る。
	 * 
	 * @return 数 
	 */
	public int getNumber()
	{
		return number_;
	}

}
