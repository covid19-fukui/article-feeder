package covid.fukui.rss.articlefeeder.exception;

/**
 * beanの生成に失敗した場合の例外
 */
public class FailedGenerateBeanException extends ArticleFeederException {

    private static final long serialVersionUID = 5337756106684712403L;


    /**
     * コンストラクタ
     *
     * @param message メッセージ
     * @param cause   Throwable
     */
    public FailedGenerateBeanException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
