package devSuperio.dscommerce.excepitions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String msg){
        super((msg));
    }
}
