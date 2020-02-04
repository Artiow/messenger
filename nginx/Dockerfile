FROM nginx:1.17.8-alpine
MAINTAINER artiow

# config import
COPY nginx/nginx.conf /etc/nginx/nginx.conf

# remove logging links
RUN rm /var/log/nginx/*