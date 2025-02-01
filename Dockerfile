# Usa a imagem base do NGINX para servir arquivos estáticos
FROM nginx:alpine

# Define o diretório de trabalho temporário
WORKDIR /app

# Copia todos os arquivos e subpastas da pasta "fundamentos"
COPY fundamentos /usr/share/nginx/html

# Expõe a porta padrão do NGINX
EXPOSE 80

# Inicia o servidor NGINX
CMD ["nginx", "-g", "daemon off;"]
