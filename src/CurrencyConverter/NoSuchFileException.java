class NoSuchFileException extends Exception
{
    static final long serialVersionUID = -1234567890123456789L;

    NoSuchFileException(String message)
    {
        super(message);
    }
}
