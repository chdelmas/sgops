/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.push;

/**
 *
 * @author chdelmas
 */
//public class PushServlet extends WebSocketServlet {
////
////    private static final long serialVersionUID = 1L;
////
////    private final Map<String,Set> connectedClients = new ConcurrentHashMap>();
////
////    @Override
////    public void init() throws ServletException {
////        super.init();
////        String[] channels = {"chat","counter"};
////
////        for(String channel : channels) {
////            this.connectedClients.put(channel, new CopyOnWriteArraySet());
////        }
////    }
////
////    @Override
////    public WebSocket doWebSocketConnect(HttpServletRequest request, String protocol) {
////        String channel = request.getRequestURI().split("/prime-push/")[1];
////        System.out.println("Canal:"+channel);
////        return new PrimeWebSocket(channel);
////    }
////
////    private class PrimeWebSocket implements WebSocket, WebSocket.OnTextMessage {
////        Connection connection;
////        String channel;
////
////        public PrimeWebSocket(String channel) {
////            this.channel = channel;
////        }
////
////        public void onClose(int closeCode, String message) {
////            connectedClients.get(this.channel).remove(this);
////        }
////
////        public void onOpen(Connection connection) {
////            this.connection = connection;
////            connectedClients.get(this.channel).add(this);
////        }
////
////        public void onMessage(String message) {
////            System.out.println(message);
////            try {
////                for(PrimeWebSocket ws : connectedClients.get(this.channel)) {
////                    ws.connection.sendMessage(message);
////                }
////            }catch(IOException e) {
////                System.out.println(e);
////            }
////        }
////    }
//}