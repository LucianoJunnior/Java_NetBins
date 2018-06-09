package aula05;

public class ContaBanco {
    //atributos
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //métodos personalizado
    
    public void estadoAtual() {
        System.out.println("--------------------------");
        System.out.println("Conta" + this.getnumConta());
        System.out.println("Conta" + this.getTipo());
        System.out.println("Conta" + this.getDono());
        System.out.println("Conta" + this.getSaldo());
        System.out.println("Conta" + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if(t =="CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com Sucesso!");
    }
    
    public void fecharConta() {
        if (this.getSaldo()>0) {
            System.out.println("A conta não pode ser encerrada, pois ainda tem saldo");
        }
        else if (this.getSaldo()<0) {
            System.out.println("A conta não pode ser encerrada, pois possui débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo (this.getSaldo()+v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível realizar depósito em uma conta fechada!");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if(this.getSaldo()>= v) {
                this.setSaldo (this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            } 
        } else {
            System.out.println("Impossível realizar saque numa conta fechada");
        }
    }
    
    public void pagarMensalidade() {
        int v = 0;
        if(this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() =="CP") {
            v = 20;
        }
        if(this.getStatus ()) {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta encerrada!");
        }
    }
    
    //metodos especiais 
   
    public void setnumConta (int n) {
        this.numConta = n;
    }
    
    public int getnumConta () {
        return this.numConta;
    }
    
    public ContaBanco () {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}