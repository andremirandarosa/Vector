# Estagio 1 - Responsavel em construir a aplicacao
FROM node:13-slim as node
WORKDIR /app
COPY package.json /app/
RUN npm i npm@latest -g
RUN npm install
COPY ./ /app/
ARG env=prod
RUN npm run build

# Estagio 2 - Responsavel por expor a aplicacao
FROM nginx:1.13
COPY --from=node /app/dist/VectorFront /usr/share/nginx/html
COPY ./nginx-custom.conf /etc/nginx/conf.d/default.conf
