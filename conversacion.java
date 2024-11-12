public class conversacion {
    
        private saludo saludo;
        private despedida despedida;
    
        public conversacion(){
            saludo = new saludo();
            despedida = new despedida();
        }
    
        public void iniciarConversacion(){
            saludo.saludar();
            despedida.despedir();
        }
    }
    

