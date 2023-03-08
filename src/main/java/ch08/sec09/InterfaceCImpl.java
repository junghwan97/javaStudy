package ch08.sec09;

public class InterfaceCImpl implements InterfaceC{
    @Override
    public void methodA() {
        System.out.println("InterfaceCImp1-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImp1-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImp1-methodC() 실행");
    }
}
